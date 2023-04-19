package atul.calculator.newproject;

import javax.persistence.*;

@Entity
@Table(name="InputOutput")
public class InputOutput {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Sr_no", updatable = false, nullable = false)
    private int Sr_no;
    private int f_no;
    private int s_no;
    private int res;

    public InputOutput(int sr_no, int f_no, int s_no, int res) {
        Sr_no = sr_no;
        this.f_no = f_no;
        this.s_no = s_no;
        this.res = res;
    }

    public InputOutput() {

    }

    public int getSr_no() {
        return Sr_no;
    }

    public void setSr_no(int sr_no) {
        Sr_no = sr_no;
    }

    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    public int getF_no() {
        return f_no;
    }

    public void setF_no(int f_no) {
        this.f_no = f_no;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
