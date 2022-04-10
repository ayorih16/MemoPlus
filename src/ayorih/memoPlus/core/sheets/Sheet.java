package ayorih.memoPlus.core.sheets;

/**
 * MemoPlusにおいて、ボード上に配置するすべてのものはこのインターフェースを実装する必要があります
 * @author ayorih
 */
public interface Sheet {

    /**
     * シートのタイトルを返します。
     * タイトルがない場合はnullを返します。
     * @return シートのタイトル
     */
    String getTitle();

    /**
     * シートのタイトルを変更します
     * @param title 新しいタイトル
     */
    void setTitle(String title);

    /**
     * 画面上に表示したときのシートの幅を返します
     * @return 画面上に表示したときのシートの幅
     */
    int getWidth();

    /**
     * 画面上に表示したときのシートの幅を変更します
     * @param width 新しい画面上に表示したときのシートの幅
     */
    void setWidth(int width);

    /**
     * 画面上に表示したときのシートの高さを返します
     * @return 画面上に表示したときのシートの高さ
     */
    int getHeight();

    /**
     * 画面上に表示したときのシートの高さを変更します
     * @param height 新しい画面上に表示したときのシートの高さ
     */
    void setHeight(int height);

}
