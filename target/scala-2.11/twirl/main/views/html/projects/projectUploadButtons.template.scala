
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object projectUploadButtons extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<div class="btn-group pull-right" role="group" style="margin:0 0">
    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#pcUpload"""),_display_(/*3.94*/project/*3.101*/.id),format.raw/*3.104*/("""">
        <i class="fa fa-cloud-upload fa-fw"></i> Upload a file...
    </button>
</div>
"""),_display_(/*7.2*/template/*7.10*/.smallmodal("pcUpload"+project.id.toString)/*7.53*/("success")/*7.64*/("Upload Files")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""
    """),format.raw/*8.5*/("""<h4>Upload your document here!</h4>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.DocumentData.upload(project.id), 'enctype -> "multipart/form-data")/*9.101*/ {_display_(Seq[Any](format.raw/*9.103*/("""
        """),format.raw/*10.9*/("""<div class="form-inline">
            <div class="form-group">
                <input type="file" name="upload" id="js-upload-files" multiple>
            </div>
            <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">Upload files</button>
        </div>
        """),format.raw/*16.109*/("""
        """),format.raw/*17.19*/("""

    """)))}),format.raw/*19.6*/("""
""")))}))}
  }

  def render(project:Project): play.twirl.api.HtmlFormat.Appendable = apply(project)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (project) => apply(project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projects/projectUploadButtons.scala.html
                  HASH: d97462d2f99ecc22fa34865b1f9259e034cf0403
                  MATRIX: 748->1|854->19|881->20|1067->180|1083->187|1107->190|1223->281|1239->289|1290->332|1309->343|1333->359|1372->361|1403->366|1469->407|1483->413|1581->502|1621->504|1657->513|1980->907|2017->926|2054->933
                  LINES: 26->1|29->1|30->2|31->3|31->3|31->3|35->7|35->7|35->7|35->7|35->7|35->7|36->8|37->9|37->9|37->9|37->9|38->10|44->16|45->17|47->19
                  -- GENERATED --
              */
          