package dk.comet.prototyping;

public class PageTraveller {

    //region -- Fields --
    AssessmentGraph ag = AssessmentGraph.getSingleton();
    private Question currentPage = ag.getGraphQ(0);
    //endregion

    public Question goToPage(int page) {
        Question q = ag.getGraphQ(page);
        currentPage = q;
        return q;
    }
}
