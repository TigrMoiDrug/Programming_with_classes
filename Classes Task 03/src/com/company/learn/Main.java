package com.company.learn;
/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/
public class Main {

    public static void main(String[] args) {
        Student [] studentsArr = new Student[10];
        studentsArr [0] = new Student("Rodionov D.V.", 1, new int [] {6, 7, 10, 9, 9});
        studentsArr [1] = new Student("Sakharuk V.M.", 1, new int [] {9, 9, 10, 9, 9});
        studentsArr [2] = new Student("Ivanov M.V.", 1, new int [] {4, 7, 6, 7, 10});
        studentsArr [3] = new Student("Kalinin I.A.", 2, new int [] {9, 7, 10, 0, 3});
        studentsArr [4] = new Student("Lisov K.N.", 2, new int [] {9, 10, 10, 10, 10});
        studentsArr [5] = new Student("Pakhomova T.S.", 3, new int [] {8, 6, 6, 7, 10});
        studentsArr [6] = new Student("Kotlin A.V.", 4, new int [] {9, 9, 10, 9, 9});
        studentsArr [7] = new Student("Zhukov O.E.", 4, new int [] {9, 9, 9, 9, 9});
        studentsArr [8] = new Student("Shurkova K.D.", 4, new int [] {4, 9, 6, 7, 3});
        studentsArr [9] = new Student("Fillipova T.V.", 4, new int [] {5, 7, 9, 7, 10});

        printExcellentStudents(studentsArr);

    }

    public static  void printExcellentStudents (Student [] students){
        for (Student value : students) {
            value.markChecker();
        }
    }
}

class Student {
    private String fullName;
    private int group;
    private int [] achievements;

    public Student (String fullName, int group, int [] achievements) {
        this.fullName = fullName;
        this.group = group;
        this.achievements = achievements;

    }

    public String getFullName() {
        return fullName;
    }

    public int getGroup() {
        return group;
    }

    public int[] getAchievements() {
        return achievements;
    }

    public void markChecker (){
        int count = 0;
        for (int j = 0; j < getAchievements().length; j++) {
            if (getAchievements()[j] < 9) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(getFullName() + " (группа " + getGroup()+ ")");
        }
    }
}



