# CICLO DE VIDA ACTIVITIES

Este projeto demonstra o ciclo de vida das **Activities** no Android.

## Como funciona
- O app possui **duas telas**: `MainActivity` e `SecondActivity`.
- Cada Activity tem um layout simples (um `TextView` e um `Button`).
- Cada método de ciclo de vida (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onRestart`, `onDestroy`) está implementado e registra mensagens no **Logcat** usando `Log.i`.
- Fluxo:
  1. Abrir o app → `MainActivity` exibe mensagem "Main Activity".
  2. Botão "Ir para Second Activity" abre a `SecondActivity`.
  3. Botão "Voltar para Main Activity" fecha a `SecondActivity` e retorna para a `MainActivity`.
  4. Ao minimizar/fechar, observe no **Logcat** a sequência dos métodos de ciclo de vida.

## Como rodar
1. Abra o Android Studio → `File > Open` → selecione a pasta do projeto.
2. Clique em **Run** para executar no emulador ou celular conectado.
3. Observe o **Logcat** para ver os métodos sendo chamados.

---
Objetivo atendido conforme especificado no enunciado do trabalho.