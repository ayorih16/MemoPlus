package ayorih.memoPlus.core.sheets;

import java.awt.*;
import java.util.Objects;

/**
 * シンプルなメモのシートです
 * @author ayorih
 */
public class Memo implements Sheet {

    private String title;//シートのタイトル
    private String content;//メモの内容
    private Color fontColor;//文字色
    private Color backgroundColor;//背景色
    private int width;//横幅
    private int height;//高さ

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * 画面上に表示したときのシートの幅を返します
     *
     * @return 画面上に表示したときのシートの幅
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * 画面上に表示したときのシートの幅を変更します
     *
     * @param width 新しい画面上に表示したときのシートの幅
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * 画面上に表示したときのシートの高さを返します
     *
     * @return 画面上に表示したときのシートの高さ
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     * 画面上に表示したときのシートの高さを変更します
     *
     * @param height 新しい画面上に表示したときのシートの高さ
     */
    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * メモの内容を返します
     * @return メモの内容
     */
    public String getContent() {
        return content;
    }

    /**
     * メモの内容を変更します
     * @param content 新しいメモの内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * メモの文字色を返します
     * @return メモの文字色
     */
    public Color getFontColor() {
        return fontColor;
    }

    /**
     * メモの文字色を変更します
     * @param fontColor 新しいメモの文字色
     */
    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * メモの背景色を返します
     * @return メモの背景色
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * メモの背景色を変更します
     * @param backgroundColor 新しいメモの背景色
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memo memo = (Memo) o;
        return getWidth() == memo.getWidth() && getHeight() == memo.getHeight() && Objects.equals(getTitle(), memo.getTitle()) && Objects.equals(getContent(), memo.getContent()) && Objects.equals(getFontColor(), memo.getFontColor()) && Objects.equals(getBackgroundColor(), memo.getBackgroundColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getContent(), getFontColor(), getBackgroundColor(), getWidth(), getHeight());
    }
}
