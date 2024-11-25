    import java.util.Scanner;

    public class QuestionService {
        Question[]  questions = new Question[5];
        String selection[] = new String[5]; 
        public QuestionService(){
            questions[0]= new Question(1,"sime of the gate", "1" , "2","3","4","1");
            questions[1]= new Question(2,"sime of the plot", "1" , "2","3","4","3");
            questions[2]= new Question(3,"sime of the car", "1" , "2","3","4","2");
            questions[3]= new Question(4,"sime of the dimond", "1" , "2","3","4","2");
            questions[4]= new Question(5,"sime of the dimond", "1" , "2","3","4","3");
        }
        public void Playquiz()
        {
            int i = 0;
            for (Question q : questions){
                System.out.println("Question no : "+ q.getId());
                System.out.println(q.getQuestion());
                System.out.println(q.getId());
                System.out.println(q.getOpt1());
                System.out.println(q.getOpt2());
                System.out.println(q.getOpt3());
                System.out.println(q.getOpt4());
                Scanner sc = new Scanner(System.in);
                selection[i] = sc.nextLine();
                i++;
            }
            for(String s :selection)
            {
                System.out.println(s);
            }
        }

        public void PrintScore()
        {
            int score = 0;
            for (int i=0; i<questions.length;i++)
            {
                Question que = questions[i];
                String actualanswer = que.getAnswer();
                String useranswer = selection[i];

                if (actualanswer.equals(useranswer)) {
                    score++;
                }
            }
            System.out.println("your score is : " + score);
        }

    }
