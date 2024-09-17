package com.quiz.quizapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.quiz.quizapp.model.questionstable;
import com.quiz.quizapp.service.questionservice;



@RestController
//@RequestMapping("/question")
public class questioncontroller {
	
	@Autowired
	questionservice Questionservice;
	@GetMapping("/allquestions")
	public ResponseEntity<List<questionstable>> getAllQuestions() {
		
		return Questionservice.getAllQuestions();
	
	
    }
	
	//@GetMapping("/category/{category}")
	//public List<questionstable> getQuestionsByCategory(@PathVariable String category){
		
		//return Questionservice.getQuestionsByCategory(category);
	//}
	
	@PostMapping("/save")
	public String addQuestion(@RequestBody questionstable question) {
		
		return Questionservice.addQuestion(question);
	}
	
	
	
	@GetMapping("/questionlist")
	public ModelAndView getquestion1() {
		
		ArrayList<String> questionTitle = Questionservice.getquestionlist();
		
		ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("questionTitle", questionTitle);
        
        return modelAndView;
		//return Questionservice.getquestion1(id);
		
	}
	
	@PostMapping("/submitQuiz")
	public ModelAndView submitQuiz() {
	    
		ArrayList<String> answerlist = Questionservice.getanswers();
		ModelAndView modelandview = new ModelAndView("resultpage");
		modelandview.addObject("answerlist",answerlist);
	
	    return modelandview; // Change this to the name of your JSP page or result page
	}

	
	
	
	
	 @GetMapping("/quiz")
	    public List<String> getQuestionsForQuiz(@RequestParam String category) {
	        List<String> questions = Questionservice.getQuestionsAndOptionsByCategory(category);
	        //ModelAndView modelAndView = new ModelAndView("quiz");
	        //modelAndView.addObject("questions", questions);
	        return questions;
	    }
}
