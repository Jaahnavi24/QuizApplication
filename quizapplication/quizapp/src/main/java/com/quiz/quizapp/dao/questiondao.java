package com.quiz.quizapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quiz.quizapp.model.questionstable;
public interface questiondao extends JpaRepository<questionstable, Integer> {

	List<questionstable> findByCategory(String category);

	@Query(value="SELECT * FROM  questionstable q where q.category=:category ORDER BY RANDOM() LIMIT :nofq",nativeQuery = true)
	List<questionstable> findRandomBycategory(String category,int nofq);

	
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.id = 1 ")
	String findquestionTitlebyId();
	
	@Query("SELECT qs.option1 FROM questionstable  qs WHERE qs.id = 1")
	String findoption1byId();
	
	@Query("SELECT qs.option2 FROM questionstable  qs WHERE qs.id = 1 ")
	String findoption2byId();
	
	@Query("SELECT qs.option3 FROM questionstable  qs WHERE qs.id = 1 ")
	String findoption3byId();
	
	@Query("SELECT qs.option4 FROM questionstable  qs WHERE qs.id = 1 ")
	String findoption4byId();
	
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.id = 2 ")
	String findquestion1TitlebyId();
	
	@Query("SELECT qs.option1 FROM questionstable  qs WHERE qs.id = 2")
	String findoption21byId();
	
	@Query("SELECT qs.option2 FROM questionstable  qs WHERE qs.id = 2 ")
	String findoption22byId();
	
	@Query("SELECT qs.option3 FROM questionstable  qs WHERE qs.id = 2 ")
	String findoption23byId();
	
	@Query("SELECT qs.option4 FROM questionstable  qs WHERE qs.id = 2 ")
	String findoption24byId();
	
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.id = 3")
	String findquestion3TitlebyId();
	
	@Query("SELECT qs.option1 FROM questionstable  qs WHERE qs.id = 3")
	String findoption31byId();
	
	@Query("SELECT qs.option2 FROM questionstable  qs WHERE qs.id = 3 ")
	String findoption32byId();
	
	@Query("SELECT qs.option3 FROM questionstable  qs WHERE qs.id = 3")
	String findoption33byId();
	
	@Query("SELECT qs.option4 FROM questionstable  qs WHERE qs.id = 3 ")
	String findoption34byId();
	
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.id = 4")
	String findquestion4TitlebyId();
	
	@Query("SELECT qs.option1 FROM questionstable  qs WHERE qs.id = 4")
	String findoption41byId();
	
	@Query("SELECT qs.option2 FROM questionstable  qs WHERE qs.id = 4 ")
	String findoption42byId();
	
	@Query("SELECT qs.option3 FROM questionstable  qs WHERE qs.id = 4")
	String findoption43byId();
	
	@Query("SELECT qs.option4 FROM questionstable  qs WHERE qs.id = 4 ")
	String findoption44byId();
	
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.id = 5")
	String findquestion5TitlebyId();
	
	@Query("SELECT qs.option1 FROM questionstable  qs WHERE qs.id = 5")
	String findoption51byId();
	
	@Query("SELECT qs.option2 FROM questionstable  qs WHERE qs.id = 5 ")
	String findoption52byId();
	
	@Query("SELECT qs.option3 FROM questionstable  qs WHERE qs.id = 5")
	String findoption53byId();
	
	@Query("SELECT qs.option4 FROM questionstable  qs WHERE qs.id = 5 ")
	String findoption54byId();
	
	@Query("SELECT qs.rightAnswer FROM questionstable  qs WHERE qs.id = 1 ")
	String findrightAnswer1byId();
	
	@Query("SELECT qs.rightAnswer FROM questionstable  qs WHERE qs.id = 2 ")
	String findrightAnswer2byId();
	
	@Query("SELECT qs.rightAnswer FROM questionstable  qs WHERE qs.id = 3 ")
	String findrightAnswer3byId();
	
	@Query("SELECT qs.rightAnswer FROM questionstable  qs WHERE qs.id = 4 ")
	String findrightAnswer4byId();
	
	@Query("SELECT qs.rightAnswer FROM questionstable  qs WHERE qs.id = 5 ")
	String findrightAnswer5byId();
	
	
	
     
	@Query("SELECT qs.questionTitle FROM questionstable  qs WHERE qs.category = :category ")
	ArrayList<String> findquestionTitlebycategory(@Param("category")String category);

	@Query("SELECT q.questionTitle, q.option1, q.option2, q.option3, q.option4 FROM questionstable q WHERE q.category = :category")
    List<String> findQuestionsAndOptionsByCategory(@Param("category") String category);

	
}
