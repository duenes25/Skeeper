/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.skeeper.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.skeeper.R



@Composable
fun VisitorScreenView(visitorScore: Int, decreaseScore:  () -> Unit, increaseScore:  () -> Unit){
  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    Text( text = stringResource(id = R.string.visitor_team),
        fontSize = 25.sp,
        color = colorResource(id = R.color.colorPrimary))
    Row( modifier = Modifier.padding(top = 15.dp)) {
      Button( onClick = { decreaseScore() },
          colors= ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color
              .colorPrimary)),
          modifier = Modifier.height(45.dp).width(70.dp)){
        Text( text = stringResource(id = R.string.decrement),
            color = Color.White)
      }
      Text( text = visitorScore.toString(),
          fontSize = 35.sp,
          color = colorResource(id = R.color.colorPrimaryDark),
          modifier = Modifier.padding(horizontal = 15.dp))
      Button( onClick = { increaseScore() },
          colors= ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color
              .colorPrimary)),
          modifier = Modifier.height(45.dp).width(70.dp)){
        Text( text = stringResource(id = R.string.increment),
            color = Color.White)
      }
    }
  }
}