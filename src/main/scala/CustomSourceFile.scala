import dotty.tools.dotc.util.SourceFile
import dotty.tools.io.{AbstractFile, VirtualFile}

import scala.io.Codec

class CustomSourceFile(file: AbstractFile, codec: Codec) extends SourceFile(file, codec) {
  override def isSelfContained: Boolean = false 
}


object CustomSourceFile {
  def virtual(name: String, content: String) = new CustomSourceFile(new VirtualFile(name, content.getBytes), scala.io.Codec.UTF8)

}