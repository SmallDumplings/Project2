package com.example.project.sticker;

import android.view.MotionEvent;

public abstract class AbstractFlipEvent implements com.example.project.sticker.StickerIconEvent {

  @Override
  public void onActionDown(StickerView stickerView, MotionEvent event) {

  }

  @Override
  public void onActionMove(StickerView stickerView, MotionEvent event) {

  }

  @Override
  public void onActionUp(StickerView stickerView, MotionEvent event) {
    stickerView.flipCurrentSticker(getFlipDirection());
  }

  @StickerView.Flip protected abstract int getFlipDirection();
}
