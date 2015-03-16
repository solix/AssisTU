
package views.html.template

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
object mediummodal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String)(theme: String)(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<div class="modal fade" id=""""),_display_(/*3.30*/id),format.raw/*3.32*/("""" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-content" style="min-width: 400px; max-width: 600px; margin: 10% auto">
        <div class="panel panel-"""),_display_(/*5.34*/theme),format.raw/*5.39*/("""">
            <div class="panel-heading" style="text-align: center">
                <button type="button" class="close pull-right" data-toggle="collapse" data-target="#"""),_display_(/*7.102*/id),format.raw/*7.104*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>"""),_display_(/*8.26*/title),format.raw/*8.31*/("""</strong>
            </div>
        </div>
        <div class="panel-body">
        """),_display_(/*12.10*/content),format.raw/*12.17*/("""
        """),format.raw/*13.9*/("""</div>
    </div>
</div>"""))}
  }

  def render(id:String,theme:String,title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(id)(theme)(title)(content)

  def f:((String) => (String) => (String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (id) => (theme) => (title) => (content) => apply(id)(theme)(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/template/mediummodal.scala.html
                  HASH: 7a7139e78451e86d75f91a56b62265b075193a32
                  MATRIX: 757->1|902->58|930->60|985->89|1007->91|1240->298|1265->303|1463->474|1486->476|1607->571|1632->576|1745->662|1773->669|1809->678
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|36->8|36->8|40->12|40->12|41->13
                  -- GENERATED --
              */
          