import java.util.Scanner;

public class QuestionService{
    
    QuestionObject[] questions  = new QuestionObject[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new QuestionObject(1, "Size of int", "2", "4", "8", "16","4");
        questions[1] = new QuestionObject(2, "size of double", "2", "4", "8", "16","8");
        questions[2] = new QuestionObject(3, "size of char", "2", "4", "8", "16","2");
        questions[3] = new QuestionObject(4, "size of long", "2", "4", "8", "16","8");
        questions[4] = new QuestionObject(5, "size of boolean", "1", "4", "8", "16","1");
    }

    public void playQuiz(){
        int i=0;
        for(QuestionObject q:questions){
            System.out.println("Question :"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A :"+q.getOpt1());
            System.out.println("B :"+q.getOpt2());
            System.out.println("C :"+q.getOpt3());
            System.out.println("D :"+q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();

        }
        System.out.println();
        for(String s:selection){
            System.out.println(s);
        }
         
    }
    public void printScore(){
        int score =0;
        for(int i=0;i<5;i++){
            if(selection[i].equals(questions[i].getAnswer())){
                System.out.println(questions[i].getId()+" :Right Answer");
                score++;
            }
            else{
                System.out.println(questions[i].getId() + " :Wrong Answer");
            }
        }
        System.out.println("Score is : "score);
    }

}
