package Solid

class Display() {
    fun displayStudentInfo(student: Student){
        println("${student.name}")
        println("${student.age}")
        println("${student.nationality}")
    }
}