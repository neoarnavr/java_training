package com.arnav.spring.withoutspring;

import com.arnav.spring.training.Coherts;
import com.arnav.spring.training.SdetCoherts;
import com.arnav.spring.training.TrainingService;

public class TrainingTest {
    public static void main(String[] args) {

        Coherts sdetCoherts = new SdetCoherts();


        TrainingService training = new TrainingService(sdetCoherts);

    }


}
