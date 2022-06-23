// Generated from antlr\ParserT.g4 by ANTLR 4.7.1
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#constan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstan(ParserTParser.ConstanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(ParserTParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declavar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclavar(ParserTParser.DeclavarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinea(ParserTParser.LineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#flotante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlotante(ParserTParser.FlotanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ParserTParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(ParserTParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(ParserTParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(ParserTParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#senlogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenlogica(ParserTParser.SenlogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfirmacion(ParserTParser.AfirmacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(ParserTParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(ParserTParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinto(ParserTParser.DistintoContext ctx);
}