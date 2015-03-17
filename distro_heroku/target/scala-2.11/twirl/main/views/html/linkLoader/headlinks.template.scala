
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



        """),format.raw/*5.9*/("""<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>

        <!-- Bootstrap Core CSS -->
        <link href=""""),_display_(/*14.22*/routes/*14.28*/.Assets.at("css/bootstrap.min.css")),format.raw/*14.63*/("""" rel="stylesheet">

        <!-- Bootstrap Core CSS -->
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.at("css/bootstrap_custom.css")),format.raw/*17.66*/("""" rel="stylesheet">

        <!-- search styling -->
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.at("css/searchform.css")),format.raw/*20.60*/("""" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href=""""),_display_(/*23.22*/routes/*23.28*/.Assets.at("css/plugins/metisMenu/metisMenu.min.css")),format.raw/*23.81*/("""" rel="stylesheet">

        <!-- Custom CSS -->
        <link href=""""),_display_(/*26.22*/routes/*26.28*/.Assets.at("css/sb-admin-2.css")),format.raw/*26.60*/("""" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href=""""),_display_(/*29.22*/routes/*29.28*/.Assets.at("css/plugins/morris.css")),format.raw/*29.64*/("""" rel="stylesheet">

        <!-- Awesome Fonts icons -->
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

        <!--bootstrap datepicker-->
        <link href=""""),_display_(/*35.22*/routes/*35.28*/.Assets.at("css/datepicker.css")),format.raw/*35.60*/("""" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

        <![endif]-->
        <style type="text/css">
            body """),format.raw/*45.18*/("""{"""),format.raw/*45.19*/("""
                """),format.raw/*46.17*/("""background: none repeat scroll 0 0 white;
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""

        """),format.raw/*49.9*/("""</style>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/linkLoader/headlinks.scala.html
                  HASH: 9eb5e92d5b2ccbb6cf5f899c86b2cd7b3fd484ee
                  MATRIX: 738->1|840->15|878->27|1169->291|1195->296|1289->363|1304->369|1360->404|1465->482|1480->488|1539->526|1640->600|1655->606|1708->638|1808->711|1823->717|1897->770|1994->840|2009->846|2062->878|2166->955|2181->961|2238->997|2490->1222|2505->1228|2558->1260|3075->1749|3104->1750|3149->1767|3235->1825|3264->1826|3301->1836
                  LINES: 26->1|29->1|33->5|39->11|39->11|42->14|42->14|42->14|45->17|45->17|45->17|48->20|48->20|48->20|51->23|51->23|51->23|54->26|54->26|54->26|57->29|57->29|57->29|63->35|63->35|63->35|73->45|73->45|74->46|75->47|75->47|77->49
                  -- GENERATED --
              */
          