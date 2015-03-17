
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
object smallmodal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String)(theme: String)(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<div class="modal fade" id=""""),_display_(/*3.30*/id),format.raw/*3.32*/("""" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-content" style="width: 400px; margin:10% auto">
        <div class="panel panel-"""),_display_(/*5.34*/theme),format.raw/*5.39*/("""">
            <div class="panel-heading" style="text-align: center">
                <button type="button" class="close pull-right" data-toggle="collapse" data-target="#"""),_display_(/*7.102*/id),format.raw/*7.104*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>"""),_display_(/*8.26*/title),format.raw/*8.31*/("""</strong>
            </div>
        </div>
        <div class="panel-body" style="margin: 0 20px">
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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/template/smallmodal.scala.html
                  HASH: 690ddf31dc913d201b0e4769872ab6848032b7d3
                  MATRIX: 756->1|901->58|929->60|984->89|1006->91|1216->275|1241->280|1439->451|1462->453|1583->548|1608->553|1744->662|1772->669|1808->678
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|36->8|36->8|40->12|40->12|41->13
                  -- GENERATED --
              */
          