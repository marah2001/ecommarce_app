fun main() {
//    استدعاء دالة
    val area = calculateArea(3.0 , 4.0)
    print("area is $area \n ")

    printName("Marah")

    printSomeValues()

    println(schoolName())
    //برنامج مسؤول عن العمليات الاساسية التي تخص المستطيل
//حساب المساحة
//حسااب المحيط
//  الاشياء المشتركة بين العمليتين
//قانون المساحة = الطول * العرض
//قانون المحيط = 2*(الطول + العرض)

}

fun calculateArea(h: Double, w: Double): Double {
    return h * w
}

fun printName(n: String){
    println("student name is $n")
}

fun printSomeValues(){
    println("I am Marah Alsafadi \n i am  20 years old \n am S.E ❤️")
}

fun schoolName() :String{
    return  "Dalal"
}

