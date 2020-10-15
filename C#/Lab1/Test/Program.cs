using System;
using System.Collections;
using System.Collections.Generic;
using Test;

namespace Test { 
    public class Class1
{
    static void Main(string[] args)
    {
        Student student1 = new Student("Kofi", " A1");
        Student student2 = new Student("Kwame", " A1");
        Student student3 = new Student("Ama", " B2");
        Student student4 = new Student("Yaa", " C4");
        Student student5 = new Student("Kojo", " D7");

            var stud = new Student("Koooo","Nine");
            stud.AttendLecture();

        student1.Listen();

        List<double> grades = new List<double>() {20.0,40.0,30.0 };
        List<double> evaluation = new List<double>() { 40.0, 50.0, 30.0 };
        Student grade1 = new Student("Don",grades);
        Console.WriteLine(grade1.Rating); 

        List<Student> students = new List<Student>();
        students.Add(student1);
        students.Add(student2);
        students.Add(student3);
        students.Add(student4);
        students.Add(student5);


        Person student_ = new Student("Nana", grades);
        Console.WriteLine("The student average rating is : " + student_.Rating);
        Person instructor = new Instructor("Mr Boat", evaluation);
        Console.WriteLine("The instructor average rating is : "+ instructor.Rating);
        


        foreach (Student student in students)
        {
            Console.WriteLine(student.ToString());
        }
    }

}
}




