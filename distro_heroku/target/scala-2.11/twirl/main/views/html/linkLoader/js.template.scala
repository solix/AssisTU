
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

<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*8.81*/(""""></script>

 
<!-- 
 keep below links commented, in case needed for diagram animation
 -->
 """),format.raw/*14.99*/("""
 """),format.raw/*15.98*/("""
 """),format.raw/*16.99*/("""





"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/linkLoader/js.scala.html
                  HASH: 4faba1d531ee738300f121781fdb7ee58eba7781
                  MATRIX: 806->0|1065->233|1079->239|1138->278|1191->305|1205->311|1285->371|1406->561|1436->659|1466->758
                  LINES: 29->1|34->6|34->6|34->6|36->8|36->8|36->8|42->14|43->15|44->16
                  -- GENERATED --
              */
          