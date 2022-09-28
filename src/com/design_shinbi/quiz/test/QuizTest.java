package com.design_shinbi.quiz.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.quiz.Question;

class QuizTest {

	@Test
	void test() {
		String line = "SHINBIデザインスクールでパンの買える日は？,月曜日,火曜日,水曜日,木曜日";
		
		
		Question question = new Question();
		question.readLine(line);
		question.display(1);
	}

	@Test
	void testResource() throws IOException {
		int n = 1;
		List<Question> questions = Question.getQuestions();
		for (Question question : questions) {
			question.display(n);
			n++;
		}
	}

}
