package com.example.demo.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ChatModel;
import com.example.demo.repository.ChatRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/")
public class ChatController {

	public ChatController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private ChatRepository chatRepository;
	
		// create chat rest api
		@PostMapping("/chat/{id}")
		public ChatModel startChat(@PathVariable String id,@RequestBody ChatModel chat) {
			return chatRepository.save(chat);
		}
	
	
		@GetMapping("/chat/{id}")
		public ResponseEntity <ChatModel> showChat(@PathVariable String id) {
			ChatModel res = chatRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("chat not exist with id :" + id));
			return ResponseEntity.ok(res);
		}
	
		@DeleteMapping("/chat/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteChatItem(@PathVariable String id){
			ChatModel res = chatRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("chat not exist with id :" + id));
			
			chatRepository.delete(res);
			Map<String, Boolean> response = new HashMap<>();
			response.put("Resource Deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}

}





