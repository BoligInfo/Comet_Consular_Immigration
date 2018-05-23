package dk.comet.prototyping;

import java.util.ArrayList;
import java.util.Collections;

public class AssessmentGraph {

<<<<<<< HEAD
   // ArrayList<Node> connections =
=======
    //region -- Fields --
    private static AssessmentGraph ag = null;

    ArrayList<Question> graphQuestions = new ArrayList<>();
    //endregion

     //region -- Constructors and singleton method --
    private AssessmentGraph() {
        System.out.println("\n\nSingleton Graph created\n\n");

        graphQuestions.add(new Question(0, "Den første - Index 0", "Det er vigtigt at den her er forsiden"));
        graphQuestions.add(new Question(11, "Steen d. 11.", "Steens spørgsmål"));
        graphQuestions.add(new Question(5, "5", "Det femte spørgsmål"));
        graphQuestions.add(new Question(2, "2", "jeg er 2"));
        graphQuestions.add(new Question(3, "Den sidste! so far..", "Patrick er den  frækkeste fyr i byen"));

        sortGraph();
    }

    public static AssessmentGraph getSingleton() {
        if (ag == null) ag = new AssessmentGraph();
        return ag;
    }
    //endregion

    //region -- Getters and Setters --
    public ArrayList<Question> getAllGraphQuestions() {
        return graphQuestions;
    }
    //endregion

    //Methods
    public void sortGraph() {
        Collections.sort(graphQuestions);
    }


    //A method for searching after Question object by its id
    //gan be preformance enhanced by using binary search
    public Question getGraphQ(int qID) {
        for (Question q: graphQuestions) {
            if (q.getId() == qID) return q;
        }

        return new Question(-1, "Error","The page > " + qID + " < you requested does not exist!");
    }
>>>>>>> 14bba60dc18b941f3df678bfaaf7fa7951d3a3ad

}
