
object Test extends dotty.runtime.LegacyApp {
  try {
    class A ; class B ; List().head.isInstanceOf[A with B]
  } catch {
    case _ :java.util.NoSuchElementException => println("ok")
  }
}
