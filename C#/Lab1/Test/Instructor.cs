using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace Test
{
    class Instructor : Person
    {

        private string name;
        private List<Double> evaluation;
        public Instructor(string name_, List<double> evaluation_) : base(name_)
        {
            name = name_;
            evaluation = evaluation_;

        }

        public override double Rating
        {
            get
            {
                /* double instruct_sum = 0;
                  foreach(double instruct_grade in instruct_grades) {
                      instruct_sum += instruct_grade;
                  }*/
                return evaluation.Average();
            }
        }

        public override void Listen()
        {

        }
    }
}
