package Inheritance

/*
    Exercício

    Crie duas classes: Point2D e Point3D. Point2D possui como propriedades as coordenadas x e y, enquanto Point3D, além
    delas, também possui a coordenada z. Utilize a relação de herança para representar essas classes.

    A respeito dos construtores, Point2D deve ter apenas um construtor, que recebe os valores de x e y como parâmetros
    (tipo Double). Já Point3D também deve ter apenas um construtor, que deve receber x, y e z como parâmetros
    (também do tipo Double)
 */

fun main() {

    val point3d = Point3D(30.5, 20.5, 26.0)

    println(point3d.x)
    println(point3d.y)
    println(point3d.z)
}

open class Point2D(val x: Double, val y: Double)

class Point3D(x: Double, y: Double, val z: Double): Point2D(x , y)