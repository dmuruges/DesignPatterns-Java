package com.programmingwithdhana;
import com.programmingwithdhana.memento.Editor;
import com.programmingwithdhana.memento.History;
import com.programmingwithdhana.state.BrushTool;
import com.programmingwithdhana.state.Canvas;
import com.programmingwithdhana.state.EraserTool;
import com.programmingwithdhana.state.SelectionTool;
import com.programmingwithdhana.state.abuse.StopWatch;

public class Main {

    public static void main(String[] args) {

        // **********  State  ******************************
        //var canvas = new Canvas();
        //Uncomment this line to use selectiontool
        //canvas.setCurrentTool(new SelectionTool());

        // Uncomment this line to use selectiontool
        //canvas.setCurrentTool(new BrushTool());

        // Uncomment this line to use selectiontool
        //canvas.setCurrentTool(new EraserTool());

        //canvas.mouseDown();
        //canvas.mouseUp();

        // **********  State Pattern abuse ******************************
        var stopwatch = new StopWatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();

        // **************  Memento  *********************************

      /*  var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());*/

    }
}
