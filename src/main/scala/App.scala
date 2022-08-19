import zio.*

object App extends ZIOAppDefault {

  def run = for {
    _ <- zio.Console.printLine("Back & Froward")
  } yield ()

}
