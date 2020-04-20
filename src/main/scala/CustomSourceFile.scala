import dotty.tools.dotc.util.SourceFile
import dotty.tools.io.{AbstractFile, PlainFile, VirtualFile,Path}

import scala.io.Codec

class CustomSourceFile(file: AbstractFile, codec: Codec) extends SourceFile(file, codec) {
  override def isSelfContained: Boolean = false 
}


object CustomSourceFile {
  def virtual(name: String, content: String) = CustomSourceFile(VirtualFile(name, content.getBytes), scala.io.Codec.UTF8)
  def file(name: String) = CustomSourceFile(PlainFile(Path(name)), scala.io.Codec.UTF8)

}