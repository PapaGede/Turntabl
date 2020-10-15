using System;
using System.Collections.Generic;

namespace Test
{

    class Student : Person
    {
        private string name;
        private string preferredSubject;
        private string energyLevel;
        private string caffeineCapacity;
        private string school;
        private string grades;


        public Student(string name_, string preferredSubject_, string energyLevel_, string caffeineCapacity_, string school_, string grades_):base(name_)
        {
            this.name = name_;
            this.preferredSubject = preferredSubject_;
            this.energyLevel = energyLevel_;
            this.caffeineCapacity = caffeineCapacity_;
            this.school = school_;
            this.grades = grades_;

        }

        public Student(string name_, string grades_):base(name_)
        {
            this.name = name_;
            this.grades = grades_;

        }
        public string Name
        {
            get { return name; }

        }

        public string PreferredSubject
        {
            get { return preferredSubject; }
        }

        public string EnergyLevel
        {
            get { return energyLevel; }
        }


        public string CaffeineCapacity
        {
            get { return energyLevel; }
        }

        public string School
        {
            get { return school; }
        }

        public string Grades
        {
            get { return grades; }
        }

        //private double rating;

        private List<double> test_grades;
        public override double Rating {
            get
            {
                double sum = 0;
                foreach(double grade in test_grades){
                    sum += grade;
                }
                return sum / test_grades.Count;
            }
        }

        public Student(string name_, List<double> test_grade):base(name_) {
            test_grades = test_grade;
            name = name_;
        
        }

        public override void Listen()
        {
            Console.WriteLine("A student can listen");
        }

        public void TakeTest()
        {
            Console.WriteLine("A student can take a test");
        }

        public void AttendLecture()
        {
            Console.WriteLine(name+" A student can attend lecture");
        }

        public override string ToString()
        {
            return name.ToString() + grades.ToString();
        }
    }

}

