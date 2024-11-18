public class QuestionService {
    Question[]  questions = new Question[5];


    public QuestionService(){
        questions[0]= new Question(1,"sime of the gate", "1" , "2","3","4","1");
        questions[1]= new Question(1,"sime of the plot", "1" , "2","3","4","3");
        questions[2]= new Question(1,"sime of the car", "1" , "2","3","4","2");
        questions[3]= new Question(1,"sime of the dimond", "1" , "2","3","4","2");
        questions[4]= new Question(1,"sime of the dimond", "1" , "2","3","4","3");

    }




    public void Playquiz()
    {
        for (Question q : questions){
            System.out.println(q);
        }
    }

}
