/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;

/**
 *
 * @author tuannnh
 */
public class CourseComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Course course1 = (Course) o1;
        Course course2 = (Course) o2;
        return course1.getCredit() - course2.getCredit();
    }

}
