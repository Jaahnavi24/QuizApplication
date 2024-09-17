package com.quiz.quizapp.service;

import java.util.*;
import com.quiz.quizapp.dao.*;
import com.quiz.quizapp.model.questionstable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.quiz.quizapp.controller.*;
import org.springframework.stereotype.Service;


@Service
public class questionservice {

	@Autowired
	private questiondao Questiondao;
	
	
	public ResponseEntity<List<questionstable>> getAllQuestions() {
		
		try {
		return new ResponseEntity<>(Questiondao.findAll(),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}


	public List<questionstable> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		return Questiondao.findByCategory(category);
	}


	public String addQuestion(questionstable question) {
		// TODO Auto-generated method stub
		Questiondao.save(question);
		
		return "success";
	}
	
	
	public String getquestion1(Integer id) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		String question1 = Questiondao.findquestionTitlebyId();
		
		
		//list.add(question);
		
		return question1;
	}
	
	public ArrayList<String> getquestionlist() {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		String question1 =		Questiondao.findquestionTitlebyId();
		String option1 =  Questiondao.findoption1byId();
		String option2 =  Questiondao.findoption2byId();
		String option3 =  Questiondao.findoption3byId();
		String option4 =  Questiondao.findoption4byId();
		list.add(question1);
		list.add(option1);
		list.add(option2);
		list.add(option3);
		list.add(option4);
		String question2 =		Questiondao.findquestion1TitlebyId();
		String option21 =  Questiondao.findoption21byId();
		String option22 =  Questiondao.findoption22byId();
		String option23 =  Questiondao.findoption23byId();
		String option24 =  Questiondao.findoption24byId();
		list.add(question2);
		list.add(option21);
		list.add(option22);
		list.add(option23);
		list.add(option24);
		String question3 =		Questiondao.findquestion3TitlebyId();
		String option31 =  Questiondao.findoption31byId();
		String option32 =  Questiondao.findoption32byId();
		String option33 =  Questiondao.findoption33byId();
		String option34 =  Questiondao.findoption34byId();
		list.add(question3);
		list.add(option31);
		list.add(option32);
		list.add(option33);
		list.add(option34);
		String question4 =		Questiondao.findquestion3TitlebyId();
		String option41 =  Questiondao.findoption41byId();
		String option42 =  Questiondao.findoption42byId();
		String option43 =  Questiondao.findoption43byId();
		String option44 =  Questiondao.findoption44byId();
		list.add(question4);
		list.add(option41);
		list.add(option42);
		list.add(option43);
		list.add(option44);
		String question5 =		Questiondao.findquestion5TitlebyId();
		String option51 =  Questiondao.findoption51byId();
		String option52 =  Questiondao.findoption52byId();
		String option53 =  Questiondao.findoption53byId();
		String option54 =  Questiondao.findoption54byId();
		list.add(question5);
		list.add(option51);
		list.add(option52);
		list.add(option53);
		list.add(option54);
	
		return list;
	}
	
	
	
	public List<String> getQuestionsAndOptionsByCategory(String category) {
        List<String> list = Questiondao.findQuestionsAndOptionsByCategory(category);
        System.out.println("fetched: "+list);
        return list;
    }


	public ArrayList<String> getanswers() {
		// TODO Auto-generated method stub
		
		ArrayList<String> answers = new ArrayList<>();
		String question1 =		Questiondao.findquestionTitlebyId();
		String question2 =		Questiondao.findquestion1TitlebyId();
		String question3 =		Questiondao.findquestion3TitlebyId();
		String question4 =		Questiondao.findquestion3TitlebyId();
		String question5 =		Questiondao.findquestion5TitlebyId();
		String answer1 = Questiondao.findrightAnswer1byId();
		String answer2 = Questiondao.findrightAnswer2byId();
		String answer3 = Questiondao.findrightAnswer3byId();
		String answer4= Questiondao.findrightAnswer4byId();
		String answer5 = Questiondao.findrightAnswer5byId();
		
		answers.add(question1);
		answers.add(answer1);
		answers.add(question2);
		answers.add(answer2);
		answers.add(question3);
		answers.add(answer3);
		answers.add(question4);
		answers.add(answer4);
		answers.add(question5);
		answers.add(answer5);
		
		return answers;
	}
      
}
