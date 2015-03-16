
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
object loginhead extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Login</title>

<!-- Bootstrap Core CSS -->
<link href=""""),_display_(/*11.14*/routes/*11.20*/.Assets.at("css/bootstrap.min.css")),format.raw/*11.55*/("""" rel="stylesheet">
<link href=""""),_display_(/*12.14*/routes/*12.20*/.Assets.at("css/bootstrap-social.css")),format.raw/*12.58*/("""" rel="stylesheet">
<!-- Normalize css file  -->
<link href=""""),_display_(/*14.14*/routes/*14.20*/.Assets.at("css/normalize.css")),format.raw/*14.51*/("""" rel="stylesheet">


<!-- MetisMenu CSS -->
<link href=""""),_display_(/*18.14*/routes/*18.20*/.Assets.at("css/plugins/metisMenu/metisMenu.min.css")),format.raw/*18.73*/("""" rel="stylesheet">


<!-- Timeline CSS -->
<link href=""""),_display_(/*22.14*/routes/*22.20*/.Assets.at("css/plugins/timeline.css")),format.raw/*22.58*/("""" rel="stylesheet">

<!-- Custom CSS -->
<link href=""""),_display_(/*25.14*/routes/*25.20*/.Assets.at("css/sb-admin-2.css")),format.raw/*25.52*/("""" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href=""""),_display_(/*28.14*/routes/*28.20*/.Assets.at("css/plugins/morris.css")),format.raw/*28.56*/("""" rel="stylesheet">

<!-- Awesome Fonts icons -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/linkLoader/loginhead.scala.html
                  HASH: ffd91a26ace5869122b18330fae5b0591b26113f
                  MATRIX: 813->0|1188->348|1203->354|1259->389|1319->422|1334->428|1393->466|1482->528|1497->534|1549->565|1634->623|1649->629|1723->682|1807->739|1822->745|1881->783|1962->837|1977->843|2030->875|2118->936|2133->942|2190->978
                  LINES: 29->1|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|46->18|50->22|50->22|50->22|53->25|53->25|53->25|56->28|56->28|56->28
                  -- GENERATED --
              */
          