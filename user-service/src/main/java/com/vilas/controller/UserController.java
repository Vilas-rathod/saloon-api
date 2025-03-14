package com.vilas.controller;

import com.vilas.exception.UserException;
import com.vilas.mapper.UserMapper;
import com.vilas.modal.User;

import com.vilas.payload.dto.UserDTO;
import com.vilas.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {


	private final UserService userService;
	private final UserMapper userMapper;

	@GetMapping("/api/users/profile")
	public ResponseEntity<UserDTO> getUserFromJwtToken(
			@RequestHeader("Authorization") String jwt) throws Exception {

		User user = userService.getUserFromJwtToken(jwt);
		UserDTO userDTO=userMapper.mapToDTO(user);


		return new ResponseEntity<>(userDTO,HttpStatus.OK);
	}

	@GetMapping("/api/users/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) throws UserException {
		User user = userService.getUserById(userId);
		if(user==null) {
			throw new UserException("User not found");
		}
		UserDTO userDTO=userMapper.mapToDTO(user);

		return new ResponseEntity<>(userDTO,HttpStatus.OK);
	}

	@GetMapping("/api/users")
	public ResponseEntity<List<User>> getUsers() throws UserException {
		List<User> users = userService.getAllUsers();

		return new ResponseEntity<>(users,HttpStatus.OK);
	}




}
