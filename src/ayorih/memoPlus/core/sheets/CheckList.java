package ayorih.memoPlus.core.sheets;

import java.util.ArrayList;
import java.util.List;

/**
 * チェックリストのシートです。
 */
public class CheckList implements Sheet{

    private final List<CheckListItem> checkListItems = new ArrayList<>();//チェックリストのアイテム
    private String title;//チェックリストのタイトル
    private int width;
    private int height;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
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
     * チェックリストのアイテムに対応するクラスです
     */
    public static class CheckListItem{

        private boolean isChecked;
        private String content;

        /**
         * 新しいチェックリストアイテムを生成します
         */
        public CheckListItem(boolean isChecked, String content){
            this.isChecked = isChecked;
            this.content = content;
        }

        /**
         * アイテムがチェックされているならtrue、されていないならfalseを返します
         * @return アイテムがチェックされているならtrue、されていないならfalse
         */
        public boolean isChecked() {
            return isChecked;
        }

        /**
         * アイテムがチェックされているかを変更します
         * @param isChecked アイテムがチェックされているならtrue、されていないならfalse
         */
        public void setIsChecked(boolean isChecked) {
            this.isChecked = isChecked;
        }

        /**
         * アイテムの内容を返します
         * @return アイテムの内容
         */
        public String getContent() {
            return content;
        }

        /**
         * アイテムの内容を変更します
         * @param content 新しいアイテムの内容
         */
        public void setContent(String content) {
            this.content = content;
        }
    }

}
