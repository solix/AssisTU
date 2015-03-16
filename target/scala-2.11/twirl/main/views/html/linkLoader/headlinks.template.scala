
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
object headlinks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""

        """),format.raw/*3.9*/("""<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">


<!-- Bootstrap Walkthrough -->
<link href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/css/bootstrap-tour.css">
<link href=""""),_display_(/*17.14*/routes/*17.20*/.Assets.at("css/walkthrough.css")),format.raw/*17.53*/("""" rel="stylesheet">



        <!-- Bootstrap Core CSS -->
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.at("css/bootstrap_custom.css")),format.raw/*22.66*/("""" rel="stylesheet">

        <!-- search styling -->
        <link href=""""),_display_(/*25.22*/routes/*25.28*/.Assets.at("css/searchform.css")),format.raw/*25.60*/("""" rel="stylesheet">
        """),format.raw/*26.30*/("""
        """),format.raw/*27.9*/("""<link href=""""),_display_(/*27.22*/routes/*27.28*/.Assets.at("css/notification.css")),format.raw/*27.62*/("""" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href=""""),_display_(/*30.22*/routes/*30.28*/.Assets.at("css/plugins/metisMenu/metisMenu.min.css")),format.raw/*30.81*/("""" rel="stylesheet">

        <!-- Custom CSS -->
        <link href=""""),_display_(/*33.22*/routes/*33.28*/.Assets.at("css/sb-admin-2.css")),format.raw/*33.60*/("""" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href=""""),_display_(/*36.22*/routes/*36.28*/.Assets.at("css/plugins/morris.css")),format.raw/*36.64*/("""" rel="stylesheet">

        <!-- Awesome Fonts icons -->
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

        <!--bootstrap datepicker-->
        <link href=""""),_display_(/*42.22*/routes/*42.28*/.Assets.at("css/datepicker.css")),format.raw/*42.60*/("""" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        

        <![endif]-->
        <style type="text/css">
            body """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
                """),format.raw/*53.17*/("""background: none repeat scroll 0 0 white;
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""

        """),format.raw/*56.9*/("""</style>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/linkLoader/headlinks.scala.html
                  HASH: 82386258dfc4275b189d9e748c049f53dc1964fa
                  MATRIX: 738->1|840->15|876->25|1166->289|1191->294|1495->571|1510->577|1564->610|1671->690|1686->696|1745->734|1846->808|1861->814|1914->846|1970->895|2006->904|2046->917|2061->923|2116->957|2216->1030|2231->1036|2305->1089|2402->1159|2417->1165|2470->1197|2574->1274|2589->1280|2646->1316|2898->1541|2913->1547|2966->1579|3400->1985|3429->1986|3474->2003|3560->2061|3589->2062|3626->2072
                  LINES: 26->1|29->1|31->3|37->9|37->9|45->17|45->17|45->17|50->22|50->22|50->22|53->25|53->25|53->25|54->26|55->27|55->27|55->27|55->27|58->30|58->30|58->30|61->33|61->33|61->33|64->36|64->36|64->36|70->42|70->42|70->42|80->52|80->52|81->53|82->54|82->54|84->56
                  -- GENERATED --
              */
          