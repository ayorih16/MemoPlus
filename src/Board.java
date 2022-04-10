import ayorih.memoPlus.core.sheets.Sheet;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * シートを配置するためのボードのクラスです。
 */
public class Board {

    private String name;//ボードの名前
    private final List<Sheet> sheetList = new ArrayList<>();//シートのリスト

    /**
     * ボードの名前を返します
     * @return ボードの名前
     */
    public String getName(){
        return name;
    }

    /**
     * ボードの名前を変更します
     * @param name 新しいボードの名前
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * ボードにシートを追加します
     * @param sheet 追加するシート
     */
    public void add(Sheet sheet){
        sheetList.add(sheet);
    }

    /**
     * ボードに複数のシートを追加します
     * @param sheets 追加するシートのリスト
     */
    public void addAll(List<Sheet> sheets){
        sheetList.addAll(sheets);
    }

    /**
     * 指定されたシートをボードから削除します
     * @param sheet ボードから削除するシート
     */
    public void remove(Sheet sheet){
        sheetList.remove(sheet);
    }

    /**
     * 指定したインデックスのシートを返します
     * @param index 返すシートのインデックス
     * @return index番目のシート
     */
    public Sheet getSheet(int index){
        return sheetList.get(index);
    }

    /**
     * すべてのシートのリストを返します。
     * このリストの内容を変更してもボードのデータは変更されません
     * @return すべてのシートのリスト
     */
    public List<Sheet> getSheetList(){
        return new ArrayList<>(sheetList);
    }


}
