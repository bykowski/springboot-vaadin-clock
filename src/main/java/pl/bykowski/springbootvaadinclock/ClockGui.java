package pl.bykowski.springbootvaadinclock;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
@StyleSheet("/styles.css")
@JavaScript("https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js")
@JavaScript("/clock.js")
public class ClockGui extends VerticalLayout {

    public ClockGui() {
        Label label = new Label();
        label.getElement().setProperty("innerHTML", "<h1 id=\"currentTime\"></h1>");
        add(label);

        System.out.println(label.getText());

    }
}
