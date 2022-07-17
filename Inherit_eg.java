class A
{
 void a() {
  System.out.println("a");
 }
}

class B extends A 
{
 void nature() {
  System.out.println("b");
 }
}

class C extends B 
{
 void c() {
  System.out.println("c");
 }
}

class Inheritance 
{
 public static void main(String args[]) {
  C c1 = new C();
  c1.a();
  c1.b();
c1.c();
 }
}
