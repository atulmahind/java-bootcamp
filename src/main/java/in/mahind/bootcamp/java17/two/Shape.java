package in.mahind.bootcamp.java17.two;

public sealed interface Shape permits Rectangle, Triangle, Circle { }

sealed class Rectangle implements Shape permits Square {}
final class Triangle implements Shape {}
final class Circle implements Shape {}
