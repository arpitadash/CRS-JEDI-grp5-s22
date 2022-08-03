package com.flipkart.exception;

/**
 * @author JEDI-group05
 *
 */

//Exception arises when course has been deleted by admin but still exists in the catalog

public class CourseNotDeletedException extends Exception{
    private String courseID;

    public CourseNotDeletedException() {
        // TODO Auto-generated constructor stub
        courseID = "";
    }

    /**
     * @param courseID
     */
    public CourseNotDeletedException(String courseID) {
        super();
        this.courseID = courseID;
    }



    /**
     * @return the courseID
     */
    public String getCourseID() {
        return courseID;
    }

    @Override
    public String getMessage() {
        return "CourseID: " + courseID + "is not deleted!";
    }

}

