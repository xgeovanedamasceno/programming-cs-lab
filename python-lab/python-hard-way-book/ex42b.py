class Person:
    name = ""
    age = 0

    # constructor
    def __init__(self, person_name, person_age):
        self.name = person_name
        self.age = person_age

    # methods
    def show_name(self):
        print(self.name)
    
    def show_age(self):
        print(self.age)
    
# end of superclass

class Student(Person):
    studentId = ""

    def __init__(self, student_name, student_age,student_id):
        Person.__init__(self, student_name, student_id)
        # another way:
        # super().__init__(student_name, student_age)
        self.student_id = student_id

    def get_id(self):
        return self.student_id

# end of subclass

# create an object of the superclass
person1 = Person("Matthew", 23)
person1.show_age()

# create um object of subclass
student1 = Student("Max", 22, "103")
print(student1.get_id())
student1.show_name()

