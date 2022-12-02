package com.lidp.fare.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "fares")
public class Fare
{
   @Id
   private Instant departureTime;
   private double distanceMi;
   private int seatRow;
   private double cost;

   public Instant getDepartureTime()
   {
      return departureTime;
   }

   public void setDepartureTime(Instant departureTime)
   {
      this.departureTime = departureTime;
   }

   public double getDistanceMi()
   {
      return distanceMi;
   }

   public void setDistanceMi(double distanceMi)
   {
      this.distanceMi = distanceMi;
   }

   public int getSeatRow()
   {
      return seatRow;
   }

   public void setSeatRow(int seatRow)
   {
      this.seatRow = seatRow;
   }

   public double getCost()
   {
      return cost;
   }

   public void setCost(double cost)
   {
      this.cost = cost;
   }

   @Override
   public String toString()
   {
      return "Fare{" + "departureTime=" + departureTime + ", distanceMi=" + distanceMi + ", seatRow=" + seatRow + ", cost=" + cost + '}';
   }
}
