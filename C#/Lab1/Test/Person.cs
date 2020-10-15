using System;
using System.Collections.Generic;
using System.Text;

namespace Test
{
    abstract class Person
    {


        private string name;

        protected Person(string name_) {
            name = name_;
        }
       public abstract double Rating { get; }
        public abstract void Listen();
    }
}
