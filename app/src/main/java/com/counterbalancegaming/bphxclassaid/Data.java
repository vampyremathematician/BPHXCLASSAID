package com.counterbalancegaming.bphxclassaid;

/**
 * Created by Nicholas on 3/15/2018.
 */

public class Data {
    private Boolean absent;
    private Boolean homework;
    private Boolean participation;
    private Boolean ticket;

    public Data() {
        setAbsent(false);
        setHomework(false);
        setParticipation(false);
        setTicket(false);
    }

    public void absentToTrue() {
        this.absent = true;
    }

    public void homeworkToTrue() {
        this.homework = true;
    }

    public void participationToTrue() {
        this.participation = true;
    }

    public void ticketToTrue() {
        this.ticket = true;
    }

    public String getAbsentAsString() {
        return ""+ absent;
    }

    public String getHomeworkAsString() {
        return ""+ homework;
    }

    public String getParticipationAsString() {
        return ""+ participation;
    }

    public String getTicketAsString() {
        return ""+ ticket;
    }

    private void setAbsent (Boolean abs) {
        this.absent = abs;
    }

    private void setHomework (Boolean hw) {
        this.homework = hw;
    }

    private void setParticipation (Boolean pt) {
        this.participation = pt;
    }

    private void setTicket (Boolean tk) {
        this.ticket = tk;
    }
}
