import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.lang.Math.*;

public class LogCalculator extends Application{
	
	Label text1;
	Button add;
	Button mult;
	Button sub;
	Button div;
	Button num0;
	Button num1;
	Button num2;
	Button num3;
	Button num4;
	Button num5;
	Button num6;
	Button num7;
	Button num8;
	Button num9;
	Button equal;
	Button clear;
	Button log;
	Button elog;
	
	int x=0;
	int sign=-1;
	int y=0;
	double a=0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Calculator");
		GridPane root = new GridPane();
		root.setVgap(5);

		text1 = new Label("0");
		
		Scene scene = new Scene(root, 153, 155);
		stage.setScene(scene);
		
		num0 = new Button("0");
		num0.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+0;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+0;
					text1.setText("" + y);
				}
			}
		});
		num1 = new Button("1");
		num1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+1;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+1;
					text1.setText("" + y);
					
				}
			}
		});
		num2 = new Button("2");
		num2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+2;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+2;
					text1.setText("" + y);
				}
			}
		});
		num3 = new Button("3");
		num3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+3;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+3;
					text1.setText("" + y);
				}
			}
		});
		num4 = new Button("4");
		num4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+4;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+4;
					text1.setText("" + y);
				}
			}
		});
		num5 = new Button("5");
		num5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+5;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+5;
					text1.setText("" + y);
				}
			}
		});
		num6 = new Button("6");
		num6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+6;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+6;
					text1.setText("" + y);
				}
			}
		});
		num7 = new Button("7");
		num7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+7;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+7;
					text1.setText("" + y);
				}
			}
		});
		num8 = new Button("8");
		num8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+8;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+8;
					text1.setText("" + y);
				}
			}
		});
		num9 = new Button("9");
		num9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (sign == -1) {
					x=(x*10)+9;
					text1.setText("" + x);
				}
				else {
					y=(y*10)+9;
					text1.setText("" + y);
				}
			}
		});
		add = new Button("+");
		add.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=0;
				text1.setText("+");
			}
		});
		mult = new Button("x");
		mult.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=2;
				text1.setText("*");
			}
		});
		sub = new Button("-");
		sub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=1;
				text1.setText("-");
			}
		});
		div = new Button("/");
		div.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=3;
				text1.setText("/");
			}
		});
		equal = new Button("=");
		equal.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				a=compute(x, sign, y);
				if(sign>2 && a==-1) {
					text1.setText("Error");
				}
				else {
					text1.setText("" + a);
				}
				x=0;
				y=0;
				sign=-1;
			}
		});
		clear = new Button("C");
		clear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text1.setText("0");
				x=0;
				y=0;
				sign=-1;
			}
		});
		log = new Button("log");
		log.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=4;
				text1.setText("log()");
			}
		});
		elog = new Button("ln");
		elog.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sign=5;
				text1.setText("ln()");
			}
		});
		
		root.add(text1, 0, 0, 5, 1);
		root.add(num7, 0, 1, 1, 1);
		root.add(num8, 1, 1, 1, 1);
		root.add(num9, 2, 1, 1, 1);
		root.add(add, 3, 1, 1, 1);
		root.add(num4, 0, 2, 1, 1);
		root.add(num5, 1, 2, 1, 1);
		root.add(num6, 2, 2, 1, 1);
		root.add(sub, 3, 2, 1, 1);
		root.add(num1, 0, 3, 1, 1);
		root.add(num2, 1, 3, 1, 1);
		root.add(num3, 2, 3, 1, 1);
		root.add(mult, 3, 3, 1, 1);
		root.add(num0, 0, 4, 1, 1);
		root.add(clear, 1, 4, 1, 1);
		root.add(equal, 2, 4, 1, 1);
		root.add(div, 3, 4, 1, 1);
		root.add(log, 4, 1, 1, 1);
		root.add(elog, 4, 2, 1, 1);
		
		stage.show();
	}
	
	public double compute(int first, int sign, int second) {
		if(sign==0) {
			return first + second;
		}
		else if(sign==1) {
			return first - second;
		}
		else if(sign==2) {
			return first * second;
		}
		else if(sign==3) {
			if(second==0) {
				return -1;
			}
			return (double)first / second;
		}
		else if(sign==4) {
			if(first<=0) {
				return -1;
			}
			return Math.log10((double)first);
		}
		else {
			if(first<=0) {
				return -1;
			}
			return Math.log((double)first);
		}
	}
}
