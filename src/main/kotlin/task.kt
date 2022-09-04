import kotlin.math.pow

fun main() {
//    برمجية حساب مساحة المربع
    val side = 8.0
    val area = side * side
    println("area of square :  $area")

//    برمجية حساب محيط المربع
    val circumference = side * 4

    println("circumference of square :  $circumference")


//    برمجية حساب مساحة المستطيل
    val height = 12.0
    val width = 3.0
    val rectangleArea = height * width
    println("area of rectangle :  $rectangleArea")

//    برمجية حساب محيط المستطيل
    val rectangleCircumference = 2 * (height + width)
    println("Circumference of rectangle :  $rectangleCircumference")


//    برمجية حساب مساحة المثلث
    val triangleR = 112.0
    val triangleHeight = 3.0
    val triangleArea = 0.5 * triangleR * triangleHeight
    println("area of rectangle :  $triangleArea")

    //    برمجية حساب محيط المثلث

    val triangleCircumference = 3 * triangleHeight
    println("Circumference of triangle  :  $triangleCircumference")

// برمجية حساب مساحة الدائرة
    val circleHalfSide = 32.5
    val circleArea = Math.PI * circleHalfSide.pow(2)
    //    Math.pow(circleHalfSide,2.0) > circleHalfSide.pow(2)
    println("area of circle  :  $circleArea")

//    برمجية حساب محيط الدائرة
    val circleCircumference = Math.PI * circleHalfSide
    println("Circumference of circle  :  $circleArea")


}


//
//قوانين الاشكال:
//        مساحة المربع = طول الضلغ * نفسه
//        محيط المربع = طول الضلع * 4
//
//        مساحة المستطيل = الطول * العرض
//        حيط المستطيل = 2*(الطول + العرض)
//
//        مساحة المثلث = 0.5 * القاعدة * الارتفاع
//        محيط المثلث = مجموع اطوال اضلاعه
//
//        مساحة الدائرة = 3.14 * نق^2
//        محيط الدائرة = نق * 3.14
