
package views.html.linkLoader

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
object js extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- jQuery -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
<!--bootstrap-->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<!--sb-Admin-->
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*6.60*/(""""></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*7.81*/(""""></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/js/bootstrap-tour.min.js"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.at("javascripts/walkthrough.js")),format.raw/*9.61*/(""""></script>





"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/linkLoader/js.scala.html
                  HASH: f48087ca4b55490c7ca5222ed2357d616daf5ba5
                  MATRIX: 806->0|1065->233|1079->239|1138->278|1190->304|1204->310|1284->370|1446->506|1460->512|1520->552
                  LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|37->9|37->9|37->9
                  -- GENERATED --
              */
          