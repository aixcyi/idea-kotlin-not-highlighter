package csense.kotlin.not.highlighter.highligter.elementHighligter

import com.intellij.lang.annotation.*
import com.intellij.psi.PsiComment
import csense.kotlin.not.highlighter.highligter.*
import csense.kotlin.not.highlighter.settings.*

class PsiCommentHighlighter(
    private val element: PsiComment,
    private val settings: NotHighlighterSettings,
    private val highlighterStrategy: AnnotationHolderHighlighterStrategy
) : ElementHighlighter {
    override fun mayHighlight(): Boolean {
        return settings.highlightComments
    }

    override fun highlight(holder: AnnotationHolder) {
        highlighterStrategy.highlightTextIn(element, holder)
    }
}