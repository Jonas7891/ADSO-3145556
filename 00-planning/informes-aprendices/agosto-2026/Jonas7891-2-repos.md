# Informe 2 — Commits en los repositorios en los que trabajaste

**Periodo:** del 1 de agosto al 30 de septiembre de 2026 (hora Colombia, UTC-5)
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz | Jonathan Steven Rizo Solano |
| Usuario de GitHub | Jonas7891 |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | faceattend-edu |
| Correo(s) con el que haces commit | jonathanrizoth08@gmail.com, 128859430+Jonas7891@users.noreply.github.com |
| Fecha de elaboración | 2026-10-06 |

## 1. Resumen de repositorios

| # | Repositorio | Enlace | Tipo | Visibilidad | Commits |
|---|---|---|---|---|---|
| 1 | `Jonas7891/ProyectoFaceAttendEDU` | https://github.com/Jonas7891/ProyectoFaceAttendEDU | Personal | Público | 13 |
| | **Total** | | | | **13** |

## 2. Detalle por repositorio

### 2.1 `Jonas7891/ProyectoFaceAttendEDU`

- **Enlace del repositorio:** https://github.com/Jonas7891/ProyectoFaceAttendEDU
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 13
- **Qué hice (2 a 3 líneas):** Mejoras de autenticación, traducciones i18n, cámara para captura de rostro y foto en móvil (agosto), más refactor de auth/estilos/traducción, backend con servicios HTTP 200, compose, seeding por gateway y llamadas API con roles corregidos (septiembre).

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [6f24fcf](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/6f24fcf) | 2026-08-03 09:41:25 -0500 | perf: mejora en el apartado de Auth |
| [739c5ac](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/739c5ac) | 2026-08-03 09:55:36 -0500 | fix: traducciones corregidas y e implementación de nuevas palabras |
| [b205f57](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/b205f57) | 2026-08-03 10:26:20 -0500 | feat: nuevas implementaciones de traducciones y cambios en las mismas |
| [10ae4c0](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/10ae4c0) | 2026-08-03 16:16:06 -0500 | Feat: funcionalidad de activar camara para capturar rostro |
| [7706247](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/7706247) | 2026-08-06 23:15:50 -0500 | Feat: Funcionalidad de tomar foto agregada |
| [6723fa2](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/6723fa2) | 2026-09-09 12:24:53 -0500 | Perf: Ref: Code refactoring with new authentication features, style changes, and improvements to the language translation section. |
| [4d4758e](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/4d4758e) | 2026-09-17 15:50:01 -0500 | Perf: Code refactoring with new authentication features, style changes, and improvements to the language translation section. |
| [ea4ab89](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/ea4ab89) | 2026-09-17 20:50:44 -0500 | Complete removal of hardcoded data; justifications are no longer simulated; report alerts resolved; i18n updated; styles and single responsibility principle implemented for screens. |
| [4f947d0](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/4f947d0) | 2026-09-22 16:44:32 -0500 | feat: backend with some services responding to http in 200 |
| [3d2dcd9](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/3d2dcd9) | 2026-09-23 14:39:26 -0500 | fix: Complete Compose solution with implemented frontend |
| [2a3685d](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/2a3685d) | 2026-09-23 17:07:40 -0500 | Code refactoring, creation of a frontend translation service, and UI improvements. |
| [1a7a727](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/1a7a727) | 2026-09-28 16:07:40 -0500 | Constructing correct API calls and fixing role assignments between Screens and ViewModels. |
| [95b35b9](https://github.com/Jonas7891/ProyectoFaceAttendEDU/commit/95b35b9) | 2026-09-28 21:15:19 -0500 | Database changes to correctly set up docker-compose. Consolidation of various improperly created roles. Import corrections in the env file. Viewmodel fixes across different screens to ensure correct API calls. |

## 3. Verificación del aprendiz

- [x] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [x] Incluí los commits de **todas las ramas** de cada repositorio, no solo de la rama por defecto.
- [x] Cada commit se cuenta una sola vez por su ID, aunque esté en varias ramas.
- [x] Sin commits de fusión (`Merge pull request…`, `Merge branch…`).
- [x] Todos los commits caen entre el 1 de agosto y el 30 de septiembre de 2026 (hora Colombia).
- [x] No repetí repositorios del Informe 1 (los de mi equipo).
- [x] Cada enlace de repositorio y de commit abre en GitHub.
- [x] El total de cada repositorio coincide con el número de filas de su tabla.
- [x] En los repositorios privados indiqué si el instructor tiene acceso.

## 4. Observaciones

- Verificado con `git log --all --no-merges --reverse --pretty=format:'%h|%ad|%an|%ae|%s' --date=iso --since="2026-08-01T00:00:00-05:00" --until="2026-09-30T23:59:59-05:00"` en el clon local (remoto `https://github.com/Jonas7891/ProyectoFaceAttendEDU.git`, ramas `main`, `develop`, `db/model-alignment-v7`, `feature/frontend-fixes`, `feature/seed-volume-data`) filtrando por `Jonas7891|jonathanrizoth08|128859430`. Resultado: 13 commits (2 como `jonathan steven rizo solano <jonathanrizoth08@gmail.com>` en agosto + 11 como `Jonathan Steven Rizo Solano <128859430+Jonas7891@users.noreply.github.com>` entre agosto y septiembre). Sin merges en el resultado.
- Los commits con correo `noreply` aparecen con committer `GitHub <noreply@github.com>` (commits vía web) pero autor `Jonathan Steven Rizo Solano`; cuentan como propios por autoría y muestran mi foto en GitHub. La variante en minúsculas se filtró por separado por distinción de mayúsculas.
- El commit `56f5039` del 2026-10-02 queda fuera por el corte al 30 de septiembre solicitado. Los merges propios (ej. `8df0f7f` de mayo) se excluyen por regla del README.
- Repositorio público, no se requiere acceso especial para verificación. Solo se reportan ID, fecha y mensaje, sin pegar código.
- No se incluyen repositorios del equipo (`fae-*`): esos van en el Informe 1.

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** Jonathan Steven Rizo Solano  **Fecha:** 2026-10-06
